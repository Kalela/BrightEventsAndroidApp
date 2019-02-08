package com.andela.philskiiiwalker.brighteventsandroidapp.registration.presenter;

import android.support.annotation.NonNull;
import android.util.Log;

import com.andela.philskiiiwalker.brighteventsandroidapp.registration.contract.RegisterContract;
import com.andela.philskiiiwalker.brighteventsandroidapp.registration.model.Users;

import com.andela.philskiiiwalker.brighteventsandroidapp.util.services.AuthService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterPresenter {
    RegisterContract.RegisterView view;
    private final AuthService authService;

    public RegisterPresenter(RegisterContract.RegisterView view, AuthService authService) {
        this.view = view;
        this.authService = authService;
    }

    public void registerUser(String email, String username, String password, String confirmPassword) {
        password = password.intern();
        confirmPassword = confirmPassword.intern();

        Users user = new Users.Builder()
                .setConfirmPassword(confirmPassword)
                .setPassword(password)
                .setUsername(username)
                .setEmail(email).build();

        if (password == confirmPassword) {
            view.showProgressBar(true);
            authService.registerUser(user).enqueue(new Callback<Users>() {
                @Override
                public void onResponse(@NonNull Call<Users> call, @NonNull Response<Users> response) {
                    if (response.isSuccessful()) {
                        view.navigateSuccess();
                    } else {
                        view.showErrorMessage();
                        view.showProgressBar(false);
                    }

                }

                @Override
                public void onFailure(@NonNull Call<Users> call, @NonNull Throwable t) {
                    view.showErrorMessage();
                    view.showProgressBar(false);
                }
            });
        } else {
            view.showPasswordToast();
        }
    }
}
