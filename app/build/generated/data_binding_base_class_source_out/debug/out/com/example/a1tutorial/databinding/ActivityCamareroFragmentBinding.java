// Generated by view binder compiler. Do not edit!
package com.example.a1tutorial.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.example.a1tutorial.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCamareroFragmentBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final BottomNavigationView bottonVavigationCamarero;

  @NonNull
  public final FrameLayout frameContainer;

  private ActivityCamareroFragmentBinding(@NonNull CoordinatorLayout rootView,
      @NonNull BottomNavigationView bottonVavigationCamarero, @NonNull FrameLayout frameContainer) {
    this.rootView = rootView;
    this.bottonVavigationCamarero = bottonVavigationCamarero;
    this.frameContainer = frameContainer;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCamareroFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCamareroFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_camarero_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCamareroFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      BottomNavigationView bottonVavigationCamarero = rootView.findViewById(R.id.botton_vavigation_camarero);
      if (bottonVavigationCamarero == null) {
        missingId = "bottonVavigationCamarero";
        break missingId;
      }
      FrameLayout frameContainer = rootView.findViewById(R.id.frame_container);
      if (frameContainer == null) {
        missingId = "frameContainer";
        break missingId;
      }
      return new ActivityCamareroFragmentBinding((CoordinatorLayout) rootView,
          bottonVavigationCamarero, frameContainer);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
