package com.jrjackson;

import org.jruby.Ruby;
import org.jruby.RubyClass;
import org.jruby.anno.JRubyClass;
import org.jruby.exceptions.RaiseException;

@JRubyClass(name = "JrJackson::ParseError", parent = "RuntimeError")
public class ParseError {

    public static RaiseException newParseError(Ruby ruby, String message) {
        RubyClass errorClass = ruby.getModule("JrJackson").getClass("ParseError");
        return RaiseException.from(ruby, errorClass, message);
    }
}
