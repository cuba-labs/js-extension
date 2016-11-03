package com.company.demo.web.ext;

import com.vaadin.annotations.JavaScript;
import com.vaadin.server.AbstractJavaScriptExtension;
import com.vaadin.ui.TextField;

@JavaScript("vaadin://my-extension.js")
public class MyExtension extends AbstractJavaScriptExtension {

    public MyExtension(TextField target) {
        super(target);

        callFunction("init", target.getId());
    }
}