package mddstudio.notes.app.view.pflockscreen.security.callbacks;

import mddstudio.notes.app.view.pflockscreen.security.PFResult;

public interface PFPinCodeHelperCallback<T> {
    void onResult(PFResult<T> result);
}
