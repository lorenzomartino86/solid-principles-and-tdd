package com.lmartino.liskovSubstitution.after;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lore on 14/01/18.
 */
public class MigrationTest {

    private Migration migration;

    @Before
    public void setUp() throws Exception {
        migration = new Migration();
    }

    @Test
    public void fly() throws Exception {
        migration.flySouth(new MallardDuck());
    }
}