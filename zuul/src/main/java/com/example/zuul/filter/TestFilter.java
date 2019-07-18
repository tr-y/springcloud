package com.example.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class TestFilter extends ZuulFilter {

   private Logger logger = LoggerFactory.getLogger(TestFilter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext  = RequestContext.getCurrentContext();
        HttpServletRequest request   = requestContext.getRequest();
        String token  = null;
        logger.info(token = request.getParameter("token"));
        if(StringUtils.isBlank(token)){
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(400);
            requestContext.setResponseBody("error");
            requestContext.set("isok",false);
            return  null;
        }else {
            requestContext.setSendZuulResponse(true);
            requestContext.setResponseStatusCode(200);
            requestContext.set("isok",true);
        }
        return null;
    }


}
