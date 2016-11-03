package com.company.demo.web.mainwindow;

import com.company.demo.web.ext.MyExtension;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.web.app.mainwindow.AppMainWindow;
import org.apache.commons.lang.math.RandomUtils;

import javax.inject.Inject;
import java.util.Map;

public class ExtAppMainWindow extends AppMainWindow {
    @Inject
    protected TextField extTextField;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        com.vaadin.ui.TextField vTextField = extTextField.unwrap(com.vaadin.ui.TextField.class);
        vTextField.setId("myExtendedInput" + RandomUtils.nextInt(100000));

        new MyExtension(vTextField);
    }
}