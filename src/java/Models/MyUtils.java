/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vinhd
 */
public class MyUtils {
    private static final String ATT_NAME_USER_NAME = "ATTRIBUTE_FOR_STORE_USER_NAME_IN_COOKIE";
    // Store user info in Session.
    
    public static void storeLoginedUser(HttpSession session, User loginedUser) {
        // On the JSP can access via ${loginedUser}
        session.setAttribute("UserInfo", loginedUser);
        //session.setAttribute("username", loginedUser.getUsername());
        session.setAttribute("isLogged", true);
    }
 
    // Get the user information stored in the session.
    public static User getLoginedUser(HttpSession session) {
        User loginedUser = (User) session.getAttribute("UserInfo");
        return loginedUser;
    }
 
    // Store info in Cookie
    public static void storeUserCookie(HttpServletResponse response, User user) {
        System.out.println("Store user cookie");
        Cookie cookieUserName = new Cookie(ATT_NAME_USER_NAME, user.getUsername());
        // 1 day (Converted to seconds)
        cookieUserName.setMaxAge(24 * 60 * 60);
        response.addCookie(cookieUserName);
    }
 
    public static String getUserNameInCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (ATT_NAME_USER_NAME.equals(cookie.getName())) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }
 
    // Delete cookie.
    public static void deleteUserCookie(HttpServletResponse response) {
        Cookie cookieUserName = new Cookie(ATT_NAME_USER_NAME, null);
        // 0 seconds (This cookie will expire immediately)
        cookieUserName.setMaxAge(0);
        response.addCookie(cookieUserName);
    }
}
