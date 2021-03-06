/**
 * Copyright 2014 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.dispatch.client;

/**
 * Hooks to be executed on every {@link com.gwtplatform.dispatch.client.DispatchCall}.
 *
 * {@link DispatchHooks#onExecute()} will be called just before any action is attempted.
 * {@link DispatchHooks#onSuccess()} will be called when any action succeeds.
 * {@link DispatchHooks#onFailure()} will be called when any action fails.
 */
public interface DispatchHooks {
    void onSuccess();

    void onExecute();

    void onFailure();
}
