/*******************************************************************************
 * Copyright (c) 2017 Synopsys, Inc
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Synopsys, Inc - initial implementation and documentation
 *******************************************************************************/
package jenkins.plugins.coverity.Utils;

import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;

public class TestableConsoleLogger {

    private String lastMessage;
    private final List<String> allMessages;
    private PrintStream printStream;

    public TestableConsoleLogger() {
        allMessages = new ArrayList<>();
        printStream = Mockito.mock(PrintStream.class);
        setUpOutputStream();
    }

    public PrintStream getPrintStream() {
        if (printStream == null) {
            new TestableConsoleLogger();
        }

        return printStream;
    }

    private void setUpOutputStream() {
        Answer<Void> setLastMessage = new Answer<Void>() {
            public Void answer(InvocationOnMock mock) throws Throwable {
                String arg = (String)mock.getArguments()[0];
                lastMessage = arg;
                allMessages.add(arg);
                return null;
            }
        };
        Mockito.doAnswer(setLastMessage).when(printStream).println(anyString());
    }

    public void verifyLastMessage(String expectedMessage) {
        assertEquals(expectedMessage, lastMessage);
    }

    public void verifyMessages(String... expectedMessages) {
        assertArrayEquals(allMessages.toArray(), expectedMessages);
    }
}
