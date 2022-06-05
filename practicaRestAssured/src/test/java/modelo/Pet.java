package modelo;

import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;

public class Pet {
	private Integer id;
	private Category category;
	private String name;
	private Tag[] tags;
	private String status;
	
	public Pet() {
		setId(29);
		setCategory(new Category(13, "Categoria2"));
		setName("Lobo");
		setTag(new Tag[] {new Tag(17, "Etiqueta1")});
		setStatus("available");
	}	
	
	public Pet(Integer id, Category category, String name, Tag[] tags, String status) {
		setId(id);
		setCategory(category);
		setName(name);
		setTag(tags);
		setStatus(status);
	}
	
	public Pet(Integer id, String categoryString, String name, String tagsString,
			String status) {
		String[] categoryStringArray = categoryString.split(":");

		Pair<String, String> category = Pair.of(categoryStringArray[0], categoryStringArray[1]);


		ArrayList<Pair<Integer, String>> tagsList = new ArrayList<Pair<Integer, String>>();

		if (!"".equalsIgnoreCase(tagsString)) {
			String[] tagStringArray = tagsString.split(",");
			for (int i = 0; i < tagStringArray.length; i++) {
				String[] tagArray = tagStringArray[i].split(":");
				tagsList.add(Pair.of(Integer.parseInt(tagArray[0]), tagArray[1]));
			}
		}
		
		Category cat = new Category(Integer.parseInt(category.getKey()), category.getValue());

		Tag[] tagArray = new Tag[tagsList.size()];
		for (int i = 0; i < tagsList.size(); i++) {
			Pair<Integer, String> p = tagsList.get(i);
			tagArray[i] = new Tag(p.getKey(), p.getValue());
		}
		
		setId(id);
		setCategory(cat);
		setName(name);
		setTag(tagArray);
		setStatus(status);
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Category getCategory() {
		return this.category;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setTag(Tag[] tags) {
		this.tags = tags;
	}
	
	public Tag[] getTag() {
		return this.tags;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return this.status;
	}

}
