package com.linecorp.kotlinjdsl.querymodel.jpql.impl

import com.linecorp.kotlinjdsl.querymodel.jpql.Path
import kotlin.reflect.KClass

data class Entity<T : Any>(
    override val type: KClass<T>,
) : Path<T>