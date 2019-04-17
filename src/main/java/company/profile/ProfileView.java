package company.profile;


import company.common.BaseView;
import company.common.Canvas;

/**
 * Prints or draws criminal profile from model.
 */
public class ProfileView extends BaseView {

    @Override
    public void draw(Canvas canvas) {
        canvas.drawText("Criminal profile: ");
        canvas.drawText("ID: " + ((ProfileModel)model).getId());
        canvas.drawText("Name: " + ((ProfileModel)model).getName());
        canvas.drawText("Active: " + ((ProfileModel)model).isActive());
    }
}