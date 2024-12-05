package helloworldmvc.controller;

import helloworldmvc.model.IModel;
import helloworldmvc.view.IView;

public class Controller {
    private final IModel model;
    private final IView view;


    public Controller(IModel model, IView view) {
        if (model==null)
            throw new NullPointerException();
        if (view==null)
            throw new NullPointerException();
        this.model = model;
        this.view = view;
    }
    public void run()
    {
        view.display(model.getMessages());
    }
}
