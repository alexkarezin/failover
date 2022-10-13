/*
 * Copyright 2022-2023, Société Générale All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.societegenerale.failover.core;

import com.societegenerale.failover.annotations.Failover;

import java.lang.reflect.Method;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author Anand Manissery
 */
public interface FailoverExecution<T> {
    T execute(Failover failover, Supplier<T> supplier, Method method, List<Object> args);
}
