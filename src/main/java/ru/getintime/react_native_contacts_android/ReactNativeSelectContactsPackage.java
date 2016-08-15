package ru.getintime.react_native_contacts_android;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.*;

public class ReactNativeSelectContactsPackage implements ReactPackage{

    private ReactNativeSelectContacts selectContacts;

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        selectContacts = new ReactNativeSelectContacts(reactContext);
        return Arrays.<NativeModule>asList(selectContacts);
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}