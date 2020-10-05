/*
 * Copyright 2020 Zeppelin Bend Pty Ltd
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.zepben.annotations;

import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * NOTE: This class has been taken from stack overflow (https://stackoverflow.com/questions/7658353/is-parametersarenonnullbydefault-applies-to-method-return-values-too)
 * <p>
 * This annotation can be applied to a package, class or method to indicate that all
 * class fields and method parameters and return values in that element are nonnull
 * by default unless overridden.
 */
@SuppressWarnings("unused")
@Documented
@Nonnull
@TypeQualifierDefault({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface EverythingIsNonnullByDefault {
}
