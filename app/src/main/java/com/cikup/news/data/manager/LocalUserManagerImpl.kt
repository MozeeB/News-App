package com.cikup.news.data.manager

import android.app.Application
import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.cikup.news.domain.manager.LocalUserManager
import com.cikup.news.utils.Constants
import com.cikup.news.utils.Constants.USER_SETTINGS
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class LocalUserManagerImpl @Inject constructor(
    private val application: Application
) : LocalUserManager {

    override suspend fun saveAppEntry() {
        application.dataStore.edit { settings ->
            settings[PreferencesKeys.APP_ENTRY] = true
        }
    }

    override fun readAppEntry(): Flow<Boolean> {
        return application.dataStore.data.map { preferences ->
            preferences[PreferencesKeys.APP_ENTRY] ?: false
        }
    }
}

private val readOnlyProperty = preferencesDataStore(name = USER_SETTINGS)

val Context.dataStore: DataStore<Preferences> by readOnlyProperty

private object PreferencesKeys {
    val APP_ENTRY = booleanPreferencesKey(name = Constants.APP_ENTRY)
}