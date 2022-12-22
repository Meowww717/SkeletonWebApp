package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutTestDrivenDevelopment() throws Exception {
        assertThat(queryProcessor.process("TDD"), containsString("Test Driven Development"));
    }

    @Test
    public void knowsAboutTeamName() throws Exception {
        assertThat(queryProcessor.process("your name"), containsString("ValentynaAndHana"));
    }

    @Test
    public void knowsAboutFollowingNumbers() throws Exception {
        assertThat(queryProcessor.process("Which of the following numbers is the largest: 41, 43, 36?"), containsString("43"));
    }

    @Test
    public void knowsAboutPlusNumber() throws Exception {
        assertThat(queryProcessor.process("What is 10 plus 88?"), containsString("98"));
    }

}
