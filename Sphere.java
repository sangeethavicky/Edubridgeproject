package interfaceexample1;

public class Sphere extends ThreeD{
	
		public Sphere()

		{

		}

		public Sphere(ShapeColor sc, double a)

		{

		super(sc, a);

		}

		public Sphere(Sphere s)

		{

		this(s.sc, s.a);

		}

		public double area()

		{

		return 4 * Math.PI * a * a;

		}

		@Override

		public double volume()

		{

		return (4.0 / 3) * Math.PI * super.volume();

		}

		public double getA()

		{

		return getA();

		}


}
