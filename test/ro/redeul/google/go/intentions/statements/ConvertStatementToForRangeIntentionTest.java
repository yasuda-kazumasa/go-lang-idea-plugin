package ro.redeul.google.go.intentions.statements;

import ro.redeul.google.go.intentions.GoIntentionTestCase;

public class ConvertStatementToForRangeIntentionTest extends GoIntentionTestCase {
    public void testCallMapExpression() throws Exception {
        doTest();
    }

    public void testCallSliceExpression() throws Exception {
        doTest();
    }

    public void testVarSliceExpression() throws Exception {
        doTest();
    }
}
