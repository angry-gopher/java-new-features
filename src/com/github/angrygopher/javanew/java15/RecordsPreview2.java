package com.github.angrygopher.javanew.java15;

import java.util.Objects;

public class RecordsPreview2 {
    //    sealed classes and records
    public sealed interface Expr
            permits ConstantExpr, PlusExpr, TimesExpr, NegExpr {
    }

    public record ConstantExpr(int i) implements Expr {
    }

    public record PlusExpr(Expr a, Expr b) implements Expr {
    }

    public record TimesExpr(Expr a, Expr b) implements Expr {
    }

    public record NegExpr(Expr e) implements Expr {
    }

    //    local records
    private int localRecord() {
        record Pair(int x, int y) {
        }
        return new Pair(1, 2).x;
    }
}
