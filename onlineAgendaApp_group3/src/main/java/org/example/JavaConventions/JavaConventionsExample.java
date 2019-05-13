package org.example.JavaConventions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections4.CollectionUtils;
import org.example.onlineagendaapp.model.OnlineAgenda;
import org.example.onlineagendaapp.model.Priority;
import org.example.onlineagendaapp.model.Task;

public class JavaConventionsExample {

	private static OnlineAgenda onlineAgenda;

	private static List<Integer> idList = new ArrayList<>();

	public static void main(String[] args) {
		onlineAgenda = new OnlineAgenda();

		printAllTasksFromTheAgenda();

		System.out.println("-----------------------------");

		addTaskToAgenda(LocalDateTime.of(2019, 2, 22, 17, 50), "New task for today", Priority.IMPORTANT);
		addTaskToAgenda(LocalDateTime.of(2019, 2, 25, 19, 50), "New task for today 2", Priority.IMPORTANT);
		printAllTasksFromTheAgenda();

		System.out.println("-----------------------------");

		tasksfortoday();
	}

	private static void initializeAgenda() {
		LocalDateTime today = LocalDateTime.now();
		addTaskToAgenda(today.minusDays(1), "Yesterday's Task", Priority.URGENT);
		addTaskToAgenda(today, "Today's task", Priority.TRIVIAL);
		addTaskToAgenda(today.plusDays(1), "Tomorrow's Task", Priority.IMPORTANT);

		// int id;

//		id = getNextRandomId();
//		idList.add(id);
//
//		Task yesterdayTask = new Task(id, today.minusDays(1), Priority.URGENT, "Yesterday's Task");
//
//		onlineAgenda.getTasks().add(yesterdayTask);
//
//		id = getNextRandomId();
//		idList.add(id);
//		Task todayTask = new Task(id, today, Priority.TRIVIAL, "Today's Task");
//
//		onlineAgenda.getTasks().add(todayTask);
//
//		id = getNextRandomId();
//		idList.add(id);
//		Task tomorrowTask = new Task(id, today.plusDays(1), Priority.IMPORTANT, "Tomorrow's Task");
//
//		onlineAgenda.getTasks().add(tomorrowTask);
	}

	private static void printAllTasksFromTheAgenda() {

		for (Task task : onlineAgenda.getTasks()) {
			System.out.println(task);
		}
	}

	private static void addTaskToAgenda(LocalDateTime completionDate, String description, Priority priprity) {

		int id = getNextRandomId();
		idList.add(id);
		Task task = new Task(id, completionDate, priprity, description);
		onlineAgenda.getTasks().add(task);
	}

	private static void deleteTaskFromAgenda(int id) {

		Iterator<Task> iterator = onlineAgenda.getTasks().iterator();

		while (iterator.hasNext()) {
			if (iterator.next().getId() == id) {
				iterator.remove();

				return;

			}
		}
	}

	private static void updateTaskPriority(int id, Priority newPriority) {

		for (Task task : onlineAgenda.getTasks()) {
			if (task.getId() == id) {
				task.setPriority(newPriority);

				return;
			}
		}
	}

	private static int getNextRandomId() {

		Random random = new Random();
		return random.nextInt(100);
	}

	private static void tasksfortoday() {

		List<Task> urgentTasks = new ArrayList<>();
		List<Task> importantTasks = new ArrayList<>();
		List<Task> trivialTasks = new ArrayList<>();

		for (Task task : onlineAgenda.getTasks()) {
			if (LocalDate.now().isEqual(task.getTargetCompletionDate().toLocalDate())) {
				switch (task.getPriority()) {

				case URGENT:
					urgentTasks.add(task);

					break;

				case IMPORTANT:
					importantTasks.add(task);

					break;

				case TRIVIAL:
					trivialTasks.add(task);

					break;
				}
			}
		}
		Collections.sort(urgentTasks, new Comparator<Task>() {

			@Override
			public int compare(Task o1, Task o2) {
				if (o1.getTargetCompletionDate() == null && o2.getTargetCompletionDate() != null) {
					return -1;
				}
				return o1.getTargetCompletionDate().compareTo(o2.getTargetCompletionDate());
			}
		});
		Collections.sort(importantTasks, new Comparator<Task>() {

			@Override
			public int compare(Task o1, Task o2) {
				if (o1.getTargetCompletionDate() == null && o2.getTargetCompletionDate() != null) {
					return -1;
				}
				return o1.getTargetCompletionDate().compareTo(o2.getTargetCompletionDate());
			}
		});
		Collections.sort(trivialTasks, new Comparator<Task>() {

			@Override
			public int compare(Task o1, Task o2) {
				if (o1.getTargetCompletionDate() == null && o2.getTargetCompletionDate() != null) {
					return -1;
				}
				return o1.getTargetCompletionDate().compareTo(o2.getTargetCompletionDate());
			}
		});
		System.out.println("URGENT tasks for today:");
		if (CollectionUtils.isEmpty(urgentTasks)) {
			System.out.println("You have no URGENT tasks");
		} else {
			for (Task task : urgentTasks) {
				System.out.println(task.toString());
			}
		}
		System.out.println("-----------------------------");
		System.out.println("IMPORTANT tasks for today:");

		if (CollectionUtils.isEmpty(importantTasks)) {
			System.out.println("You have no IMPORTANT tasks");
		}

		else {
			for (Task task : importantTasks) {
				System.out.println(task.toString());
			}
		}
		System.out.println("-----------------------------");
		System.out.println("TRIVIAL tasks for today:");

		if (CollectionUtils.isEmpty(trivialTasks)) {
			System.out.println("You have no TRIVIAL tasks");
		} else {
			for (Task task : trivialTasks) {
				System.out.println(task.toString());
			}
		}

	}

}
