package com.code.bad;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Test;

import java.util.List;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;

public class ExampleTest {

  private static class TestMatcher extends TypeSafeMatcher<String> {

    @Override
    protected boolean matchesSafely(String item) {
      return true;
    }

    @Override
    public void describeTo(Description description) {
      description.appendText("matches everything");
    }
  }

  @Test
  public void test() {
    final List<String> list = Collections.singletonList("");
    assertThat(list, hasItem(new TestMatcher()));
  }

}

