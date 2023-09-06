package ey_9;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.ObjectInput;

import java.io.ObjectInputStream;

import java.io.ObjectOutput;

import java.io.ObjectOutputStream;

import java.io.Serializable;

class SerializableSingleton implements Serializable {

	private static final long serialVersionUID = 1L;

	private SerializableSingleton() {

	}

	private static class SingletonHelper {

		private static final SerializableSingleton instance = new SerializableSingleton();

	}

	public static SerializableSingleton getInstance() {

		return SingletonHelper.instance;

	}

	protected Object readResolve() {

		return getInstance();

	}

}

public class SerializableAndDeserializeUsingSingleton {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		SerializableSingleton instance1 = SerializableSingleton.getInstance();

		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("C:/Files/Abc.txt"));

		out.writeObject(instance1);

		out.close();

		ObjectInput in = new ObjectInputStream(new FileInputStream("C:/Files/Abc.txt"));

		SerializableSingleton instance2 = (SerializableSingleton) in.readObject();

		in.close();

		System.out.println("instance 1- hashcode value" + instance1.hashCode());

		System.out.println("instance 2- hashcode value" + instance2.hashCode());

	}

}
