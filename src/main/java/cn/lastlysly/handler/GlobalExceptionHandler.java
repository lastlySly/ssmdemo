package cn.lastlysly.handler;

import cn.lastlysly.myutils.MyResult;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-06-26 15:43
 **/
//@ControllerAdvice 标识这是一个异常处理类
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = MyCustomException.class)
    @ResponseBody
    public MyResult customExceptionHandler(HttpServletRequest request,HttpServletResponse response,Exception e){
        return new MyResult(0,e.getMessage(),null);
    }

    @ExceptionHandler(value = UnauthorizedException.class)
    @ResponseBody
    public MyResult permissionExceptionHandler(HttpServletRequest request,HttpServletResponse response,Exception e){
        return new MyResult(0,"这里是全局异常处理，需要权限才能访问" + e.getMessage(),null);
    }
}
