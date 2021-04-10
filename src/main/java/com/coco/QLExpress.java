package com.coco;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;


public class QLExpress {

    public static void main(String[] args) throws Exception {
        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        context.put("a",1);
        context.put("b",2);
        context.put("c",3);
        context.put("s1","ss");
        context.put("s2","yy");
        String express = "a+b*c";
        Object r = runner.execute(express, context, null, true, false);
        System.out.println(r);
        express = "s1+s2";
         r = runner.execute(express, context, null, true, false);
        System.out.println(r);
    }
}
