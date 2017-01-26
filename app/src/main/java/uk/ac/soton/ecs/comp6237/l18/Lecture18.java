package uk.ac.soton.ecs.comp6237.l18;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openimaj.content.slideshow.PictureSlide;
import org.openimaj.content.slideshow.Slide;
import org.openimaj.content.slideshow.SlideshowApplication;

import uk.ac.soton.ecs.comp6237.utils.Utils;
import uk.ac.soton.ecs.comp6237.utils.annotations.JvmArgs;
import uk.ac.soton.ecs.comp6237.utils.annotations.Lecture;

@Lecture(title = "L18: Recommending Netflix Movies",
handoutsURL = "https://github.com/jonhare/COMP6237/blob/master/notes/Netflix.pdf",
slidesURL = "http://comp6237.ecs.soton.ac.uk/lectures/pdf/Netflix.pdf")
@JvmArgs(vmArguments = "-Xmx1G")
public class Lecture18 {
	public static void main(String[] args) throws IOException {
		final List<Slide> slides = new ArrayList<Slide>();

		for (int i = 1; i <= 30; i++) {
			slides.add(new PictureSlide(Lecture18.class.getResource(String.format("l18.%03d.jpeg", i))));
		}

		new SlideshowApplication(slides, 1024, 768, Utils.BACKGROUND_IMAGE);
	}
}
