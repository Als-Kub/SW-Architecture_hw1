package hw_1.ModelEliments;

import hw_1.Stuff.Type;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int ID;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> cameras = new ArrayList<Camera>();

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.ID = id;
        if (models.size() > 0) {
            this.Models = models;
        } else {
            throw new Exception("Необходима хотя бы одна модель");
        }
        this.Flashes = flashes;
        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new Exception("Необходима хотя бы одна модель");
        }
    }

    public Type method1(Type type1) {
        return new Type();
    }

    public Type method2(Type type1, Type type2) {
        return new Type();
    }
}
