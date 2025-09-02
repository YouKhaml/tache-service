//package org.example.tacheservice.security;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//
//@Component
//public class JwtAutenticationFilter extends OncePerRequestFilter {
//
//    private JwtUtil jwtUtil;
//
//
//
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        String authHeader = request.getHeader("Authorization");
//        String token = null;
//        String username = null;
//        // 1. Vérifier que l'en-tête Authorization contient un token JWT
//        if (authHeader != null && authHeader.startsWith("Bearer ")) {
//            token = authHeader.substring(7); // Supprime "Bearer "
//            try {
//                username = jwtUtil.extractUsername(token);
//            } catch (Exception e) {
//                logger.error("Erreur lors de l'extraction du token : " + e.getMessage());
//            }
//        }
//
//        filterChain.doFilter(request, response);
//    }
//}
