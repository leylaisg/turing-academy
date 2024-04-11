package az.edu.turing.module02.miniproject_hf;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public void addChild(Human child) {
        Human[] addedChildren = new Human[children.length + 1];
        System.arraycopy(addedChildren, 0, children, 0, children.length);
        addedChildren[children.length] = child;
        children = addedChildren;
        child.setFamily(this);
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index > children.length) return false;
        else {
            Human[] deletedChildren = new Human[children.length - 1];
            System.arraycopy(children, 0, deletedChildren, 0, index);
            if (deletedChildren.length - index > 0) {
                System.arraycopy(children, index + 1, deletedChildren.length, index, deletedChildren.length - index);
                children = deletedChildren;
                return true;
            }
        }
        return true;
    }

    public int countFamily() {
        if (pet != null) {
            return children.length + 3;
        } else {
            return children.length + 2;
        }
    }


    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family{mother=%s, father=%s, children=%s, pet=%s}".
                formatted(mother, father, Arrays.toString(children), pet);
    }
}