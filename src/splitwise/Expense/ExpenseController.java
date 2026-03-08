package splitwise.Expense;

import splitwise.BalanceSheetController;
import splitwise.Expense.Split.ExpenseSplit;
import splitwise.Expense.Split.Split;
import splitwise.User.User;

import java.util.List;

public class ExpenseController {

    BalanceSheetController balanceSheetController;

    public ExpenseController() {
        balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, String description,
                                 double expenseAmount, User paidByUIser, ExpenseSplitType expenseSplitType, List<Split> splitDetails) {
        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(expenseSplitType);
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);

        Expense expense = new Expense(expenseId, description, expenseAmount, paidByUIser, expenseSplitType, splitDetails);
        balanceSheetController.updateUserExpenseBalanceSheet(paidByUIser, splitDetails, expenseAmount);

        return expense;
    }
}
