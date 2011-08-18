/**
 * 
 */
package com.x.web.filter;

import java.io.IOException;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.filter.OncePerRequestFilter;

import com.x.web.util.FlashMap;

/**
 * @author sqlxx
 *
 */
public class FlashMessageFilter extends OncePerRequestFilter {

    /* (non-Javadoc)
     * @see org.springframework.web.filter.OncePerRequestFilter#doFilterInternal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, javax.servlet.FilterChain)
     */
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if(session != null) {
            @SuppressWarnings("unchecked")
            Map<String, Object> fm = (Map<String, Object>) session.getAttribute(FlashMap.FLASH_MAP_ATTRIBUTE);
            if (fm != null) {
                for (Map.Entry<String, Object> entry : fm.entrySet()) {
                    if (request.getAttribute(entry.getKey()) == null) {
                        request.setAttribute(entry.getKey(), entry.getValue());
                    }
                }
                session.removeAttribute(FlashMap.FLASH_MAP_ATTRIBUTE);
            }
        }
        filterChain.doFilter(request, response);
        
    }

}
