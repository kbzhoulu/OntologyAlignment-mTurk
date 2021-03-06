package com.amazonaws.mturk.test;
/*
 * Copyright (c) Amazon.com, Inc. or its affiliates.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */ 

import junit.textui.TestRunner;
import com.amazonaws.mturk.addon.HITQuestion;

public class TestHITQuestion extends TestBase {
    
    public static void main(String[] args) {
        TestRunner.run(TestHITQuestion.class);
    }
    
    public TestHITQuestion(String arg0) {
        super(arg0);
    }
    
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    public void testLoadUTF8QuestionFile() throws Exception {
        HITQuestion q = new HITQuestion(defaultUTF8QuestionFileName);
        assertFalse("Expected Unicode string was missing.", q.getQuestion().indexOf("Uñìçődé") == -1);
    }
}
