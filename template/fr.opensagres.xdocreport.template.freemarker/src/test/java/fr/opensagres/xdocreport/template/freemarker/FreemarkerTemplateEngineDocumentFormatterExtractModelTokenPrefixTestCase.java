/**
 * Copyright (C) 2011-2012 The XDocReport Team <xdocreport@googlegroups.com>
 *
 * All rights reserved.
 *
 * Permission is hereby granted, free  of charge, to any person obtaining
 * a  copy  of this  software  and  associated  documentation files  (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute,  sublicense, and/or sell  copies of  the Software,  and to
 * permit persons to whom the Software  is furnished to do so, subject to
 * the following conditions:
 *
 * The  above  copyright  notice  and  this permission  notice  shall  be
 * included in all copies or substantial portions of the Software.
 *
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY,    FITNESS    FOR    A   PARTICULAR    PURPOSE    AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE,  ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package fr.opensagres.xdocreport.template.freemarker;

import junit.framework.TestCase;

public class FreemarkerTemplateEngineDocumentFormatterExtractModelTokenPrefixTestCase
    extends TestCase
{

    public void test1()
        throws Exception
    {
        FreemarkerDocumentFormatter formatter = new FreemarkerDocumentFormatter();
        String fieldName = "${developers.name}";

        String token = formatter.extractModelTokenPrefix( fieldName );

        assertEquals( "developers", token );
    }

    public void test2()
        throws Exception
    {
        FreemarkerDocumentFormatter formatter = new FreemarkerDocumentFormatter();
        String fieldName = "${developers.name";

        String token = formatter.extractModelTokenPrefix( fieldName );

        assertEquals( null, token );
    }

    public void test3()
        throws Exception
    {
        FreemarkerDocumentFormatter formatter = new FreemarkerDocumentFormatter();
        String fieldName = "${name}";

        String token = formatter.extractModelTokenPrefix( fieldName );

        assertEquals( "name", token );
    }

    public void test4()
        throws Exception
    {
        FreemarkerDocumentFormatter formatter = new FreemarkerDocumentFormatter();
        String fieldName = "${developers.roles.name}";

        String token = formatter.extractModelTokenPrefix( fieldName );

        assertEquals( "developers.roles", token );
    }

}
