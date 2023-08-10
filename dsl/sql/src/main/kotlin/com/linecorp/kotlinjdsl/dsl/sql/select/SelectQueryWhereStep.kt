package com.linecorp.kotlinjdsl.dsl.sql.select

import com.linecorp.kotlinjdsl.querymodel.sql.Predicate
import com.linecorp.kotlinjdsl.querymodel.sql.SelectQuery
import com.linecorp.kotlinjdsl.querymodel.sql.SqlQueryable

interface SelectQueryWhereStep : SelectQueryGroupByStep, SqlQueryable<SelectQuery> {
    fun where(predicate: Predicate): SelectQueryGroupByStep

    fun whereAnd(vararg predicates: Predicate): SelectQueryGroupByStep
    fun whereAnd(predicates: Iterable<Predicate>): SelectQueryGroupByStep

    fun whereOr(vararg predicates: Predicate): SelectQueryGroupByStep
    fun whereOr(predicates: Iterable<Predicate>): SelectQueryGroupByStep
}