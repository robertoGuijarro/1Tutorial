// Generated by view binder compiler. Do not edit!
package com.example.a1tutorial.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.a1tutorial.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button registerBtn;

  @NonNull
  public final EditText registerEmail;

  @NonNull
  public final Spinner registerOficio;

  @NonNull
  public final EditText registerPassword;

  @NonNull
  public final EditText resgisterName;

  private ActivityRegisterBinding(@NonNull ConstraintLayout rootView, @NonNull Button registerBtn,
      @NonNull EditText registerEmail, @NonNull Spinner registerOficio,
      @NonNull EditText registerPassword, @NonNull EditText resgisterName) {
    this.rootView = rootView;
    this.registerBtn = registerBtn;
    this.registerEmail = registerEmail;
    this.registerOficio = registerOficio;
    this.registerPassword = registerPassword;
    this.resgisterName = resgisterName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      Button registerBtn = rootView.findViewById(R.id.registerBtn);
      if (registerBtn == null) {
        missingId = "registerBtn";
        break missingId;
      }
      EditText registerEmail = rootView.findViewById(R.id.registerEmail);
      if (registerEmail == null) {
        missingId = "registerEmail";
        break missingId;
      }
      Spinner registerOficio = rootView.findViewById(R.id.registerOficio);
      if (registerOficio == null) {
        missingId = "registerOficio";
        break missingId;
      }
      EditText registerPassword = rootView.findViewById(R.id.registerPassword);
      if (registerPassword == null) {
        missingId = "registerPassword";
        break missingId;
      }
      EditText resgisterName = rootView.findViewById(R.id.resgisterName);
      if (resgisterName == null) {
        missingId = "resgisterName";
        break missingId;
      }
      return new ActivityRegisterBinding((ConstraintLayout) rootView, registerBtn, registerEmail,
          registerOficio, registerPassword, resgisterName);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
