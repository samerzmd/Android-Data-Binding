# Android-Data-Binding

is this even stable ?

i was going with what docs say's

until i rached this

Binding Events
Events may be bound to handler methods directly, similar to the way android:onClick can be assigned to a method in the Activity. Event attribute names are governed by the name of the listener method with a few exceptions. For example, View.OnLongClickListener has a method onLongClick(), so the attribute for this event is android:onLongClick.

To assign an event to its handler, use a normal binding expression, with the value being the method name to call. For example, if your data object has two methods:

public class MyHandlers {
    public void onClickFriend(View view) { ... }
    public void onClickEnemy(View view) { ... }
}
The binding expression can assign the click listener for a View:

'<?xml version="1.0" encoding="utf-8"?>'
'<layout xmlns:android="http://schemas.android.com/apk/res/android">
   <data>
       <variable name="handlers" type="com.example.Handlers"/>
       <variable name="user" type="com.example.User"/>
   </data>
   <LinearLayout
       android:orientation="vertical"
       android:layout_width="match_parent"
       android:layout_height="match_parent">
       <TextView android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:text="@{user.firstName}"
           android:onClick="@{user.isFriend ? handlers.onClickFriend : handlers.onClickEnemy}"/>
       <TextView android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:text="@{user.lastName}"
           android:onClick="@{user.isFriend ? handlers.onClickFriend : handlers.onClickEnemy}"/>
   </LinearLayout>
</layout>'

first i found that the docs created a class called MyHandlers but in the layout used com.example.Handlers
no probelm i changed it to com.example.MyHandlers

after that i hit on the text view and the onclick method has not been called !!


maybe we need to wait a little bit
