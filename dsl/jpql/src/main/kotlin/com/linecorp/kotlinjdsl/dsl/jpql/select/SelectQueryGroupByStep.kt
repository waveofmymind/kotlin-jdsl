package com.linecorp.kotlinjdsl.dsl.jpql.select

import com.linecorp.kotlinjdsl.querymodel.jpql.Expressionable
import com.linecorp.kotlinjdsl.querymodel.jpql.JpqlQueryable
import com.linecorp.kotlinjdsl.querymodel.jpql.SelectQuery

interface SelectQueryGroupByStep<T> : SelectQueryHavingStep<T>, JpqlQueryable<SelectQuery<T>> {
    fun groupBy(vararg expressions: Expressionable<*>): SelectQueryHavingStep<T>

    fun groupBy(expressions: Collection<Expressionable<*>>): SelectQueryHavingStep<T>
}