package com.linecorp.kotlinjdsl.querymodel.jpql.expression.impl

import com.linecorp.kotlinjdsl.Internal
import com.linecorp.kotlinjdsl.querymodel.jpql.expression.Expression
import com.linecorp.kotlinjdsl.querymodel.jpql.expression.ExpressionAndExpression

@Internal
data class JpqlExpressionAndExpression<T> internal constructor(
    override val first: Expression<T>,
    override val second: Expression<T>,
) : ExpressionAndExpression<T>