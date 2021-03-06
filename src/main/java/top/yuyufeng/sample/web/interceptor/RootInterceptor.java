package top.yuyufeng.sample.web.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 根拦截器
 */
public class RootInterceptor implements HandlerInterceptor {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());
    // 进入Handler方法之前
    // 用于身份认真、身份授权
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LOG.debug("RootInterceptor.preHandle");
        return true;
    }

    // 进入Handler方法之后，返回modelAndView之前执行
    // 应用场景从模型出发 公用model数据（菜单导航）在这里传到视图，也可以在这里统一指定视图
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }


    // 执行Handler完成执行此方法
    // 应用场景：统一异常处理，统一日志处理
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
