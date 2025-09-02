//package org.example.tacheservice.config;
//
//import feign.RequestInterceptor;
//import feign.RequestTemplate;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//
//
//@Configuration
//public class FeignClientInterceptor implements RequestInterceptor {
//
//    @Override
//    public void apply(RequestTemplate template) {
//        // Récupérer le token du contexte de sécurité (SecurityContextHolder ou HttpServletRequest)
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if (authentication != null && authentication.getCredentials() instanceof String token) {
//            template.header("Authorization", "Bearer " + token);
//        }
//    }
//}
//
