package com.mozilla.seleniumgrid.servlet;

import org.webbitserver.HttpControl;
import org.webbitserver.HttpHandler;
import org.webbitserver.HttpRequest;
import org.webbitserver.HttpResponse;

import java.awt.*;

public class MouseMoveHandler implements HttpHandler {

    @Override
    public void handleHttpRequest(HttpRequest httpRequest, HttpResponse httpResponse, HttpControl httpControl) throws AWTException {
        Robot moveMouse = new Robot();
        moveMouse.mouseMove(0,0);

        httpResponse.header("Content-type", "text/html")
                    .content("<html><body>We have moved the mouse</body></html>")
                    .end();

    }
}
