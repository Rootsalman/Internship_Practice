// Write an abstract class "Bank" which has a non-abstract method "getInterestRate()" and an abstract method "calculateInterest()". Implement two subclasses "SavingsAccount" and "FixedDeposit" which implement the method "calculateInterest()" according to their own interest calculation formulae.
abstract class Bank{
  abstract double getInterestRate()
}
abstract void calculateInterest();
void 