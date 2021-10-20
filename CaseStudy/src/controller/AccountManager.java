package controller;

import authentication.Account;
import storage.FileManagerAccount;

import java.io.IOException;
import java.util.List;

public class AccountManager implements IGeneralManager<Account> {
    private List<Account> accountList;
    private FileManagerAccount fileManagerAccount;

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public FileManagerAccount getFileManagerAccount() {
        return fileManagerAccount;
    }

    public void setFileManagerAccount(FileManagerAccount fileManagerAccount) {
        this.fileManagerAccount = fileManagerAccount;
    }

    @Override
    public List<Account> findAll() {
        return accountList;
    }

    @Override
    public void add(Account account) throws IOException {
        accountList.add(account);
        fileManagerAccount.writeFile(accountList);

    }

    @Override
    public void update(int index, Account account) throws IOException {
        accountList.set(index, account);
        fileManagerAccount.writeFile(accountList);
    }

    @Override
    public void deleteById(int index) throws IOException {
        accountList.remove(index);
        fileManagerAccount.writeFile(accountList);
    }

    @Override
    public void showAllList() {
        for (Account a : accountList) {
            System.out.println(a.toString());
        }
    }

    public Account searchByUsername(String username) {
        Account account = null;
        for (Account a : accountList) {
            if (a.getUsername().equals(username)) {
                account = a;
            }
        }
        return account;
    }
}
