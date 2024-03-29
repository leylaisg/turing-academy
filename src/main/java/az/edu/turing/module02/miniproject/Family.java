package az.edu.turing.module02.miniproject;

import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public void addChild(Human child) {
        Human[]newChildren = new Human[children.length+1];
        System.arraycopy(newChildren, 0, children, 0, children.length);
        newChildren[children.length] = child;
        children=newChildren;
        child.setFamily(this);
        }
    public boolean deleteChild(int index) {
        if (index < 0 || index > children.length) return false;
        else {
            Human[] updatedChildren = new Human[children.length - 1];
            System.arraycopy(children, 0, updatedChildren, 0, index);
            if (updatedChildren.length - index >= 0)
                System.arraycopy(children, index + 1, updatedChildren, index, updatedChildren.length - index);
            children = updatedChildren;
            return true;
        }
    }
    public boolean deleteChild(Human child) {
        for (int i = 0; i < children.length; i++) {
            if (children[i].hashCode() == child.hashCode()) {
                Human[] deletedChildren = new Human[children.length - 1];
                System.arraycopy(children, 0, deletedChildren, 0, i);
                if (deletedChildren.length - i >= 0)
                    System.arraycopy(children, i + 1, deletedChildren, i, deletedChildren.length - i);
                children = deletedChildren;
                return true;
            }
        }
        return false;
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
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father)
                && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }
}