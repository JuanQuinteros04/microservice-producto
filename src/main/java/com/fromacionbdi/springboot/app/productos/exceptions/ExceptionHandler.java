package com.fromacionbdi.springboot.app.productos.exceptions;//package com.quinteros.rest.exceptions;
//
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//@ControllerAdvice
//public class ExceptionHandler extends ResponseEntityExceptionHandler {
//    @org.springframework.web.bind.annotation.ExceptionHandler(value = {NotFoundException.class})
//    protected ResponseEntity<Object> hadnleConflict(
//            NotFoundException ex, WebRequest request){
//        String bodyOfResponse = ex.getMessage();
//        return handleExceptionInternal(ex, bodyOfResponse,
//                new HttpHeaders(), ex.getHttpstatus(), request);
//    }
//}
