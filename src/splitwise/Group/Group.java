package splitwise.Group;

import splitwise.Expense.Expense;
import splitwise.Expense.ExpenseController;
import splitwise.Expense.ExpenseSplitType;
import splitwise.Expense.Split.Split;
import splitwise.User.User;

import java.util.ArrayList;
import java.util.List;

public class Group {

    String groupId;
    String groupName;
    List<User> groupMembers;

    List<Expense> expenseList;

    ExpenseController expenseController;

    Group() {
        groupMembers = new ArrayList<>();
        expenseList = new ArrayList<>();
        expenseController = new ExpenseController();
    }

    //add member to group
    public void addMember(User member) {
        groupMembers.add(member);
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount, User paidByUIser,
                                 ExpenseSplitType expenseSplitType, List<Split> splitDetails) {
        Expense expense = expenseController.createExpense(expenseId, description, expenseAmount, paidByUIser, expenseSplitType, splitDetails);
        expenseList.add(expense);
        return expense;
    }
}
