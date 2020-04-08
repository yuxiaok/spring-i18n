package com.ly.interceptor;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description 自定义拦截器
 * @Date 2020/4/8 15:51
 * @Author 8201
 */
public class InternationalInterceptor extends HandlerInterceptorAdapter {

    private static final String DEFAULT_PARAM_NAME = "language";

    private String paramName = DEFAULT_PARAM_NAME;

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String localeString = request.getParameter(getParamName());
        LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
        if (localeResolver == null) {
            throw new IllegalArgumentException("No LocaleResolver found: not in a DispatcherServlet request?");
        }
        localeResolver.setLocale(request, response, StringUtils.parseLocaleString(localeString));
        return true;
    }

}
