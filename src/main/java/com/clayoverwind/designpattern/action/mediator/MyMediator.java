package com.clayoverwind.designpattern.action.mediator;

import com.clayoverwind.designpattern.util.DebugUtil;

/**
 * @author clayoverwind
 * @version 2017/6/19
 * @E-mail clayanddev@163.com
 */
public class MyMediator implements Mediator {
    private User user1;

    private User user2;

    @Override
    public void createMediator() {
        user1 = new User(this) {
            @Override
            void work() {
                System.out.println("user1 work!");
            }
        };
        user2 = new User(this) {
            @Override
            void work() {
                System.out.println("user2 work!");
            }
        };
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }
}
