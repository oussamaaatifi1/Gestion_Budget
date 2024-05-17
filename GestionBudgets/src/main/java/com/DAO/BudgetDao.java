package com.DAO;


import com.Beans.Budget;

import java.util.List;

public interface BudgetDao {
    void createBudget(Budget budget);
    void editBudget(Budget budget);
    void deleteBudget(int budgetId);
    List<Budget> getAllBudgets();

}
