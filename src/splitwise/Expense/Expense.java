package splitwise.Expense;

import splitwise.Expense.Split.Split;
import splitwise.User.User;

import java.util.ArrayList;
import java.util.List;

public class Expense {

    private String expenseId;
    private String description;
    private double expenseAmount;
    private User paidByUIser;
    private ExpenseSplitType expenseSplitType;;
    private List<Split> splitDetails = new ArrayList<>();

    public Expense(String expenseId, String description, double expenseAmount,
                   User paidByUIser, ExpenseSplitType expenseSplitType, List<Split> splitDetails) {
        this.expenseId = expenseId;
        this.description = description;
        this.expenseAmount = expenseAmount;
        this.paidByUIser = paidByUIser;
        this.expenseSplitType = expenseSplitType;
        this.splitDetails.addAll(splitDetails);
    }
}
