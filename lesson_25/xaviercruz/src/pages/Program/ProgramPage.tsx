import {useState} from 'react';
import {useNavigate} from 'react-router-dom';

interface FormData {
  name: string;
  description: string;
}

export const ProgramPage: React.FC = () => {
  const navigate = useNavigate();
  const [formData, setFormData] = useState<FormData>({
    name: '',
    description: '',
  });

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();

    if (!formData.name || !formData.description) {
      alert('Please fill in all fields');
      return;
    }

    const storedPrograms = localStorage.getItem('programs');
    const programs = storedPrograms ? JSON.parse(storedPrograms) : [];

    const isDuplicate = programs.some(
      (program: FormData) => program.name === formData.name
    );

    if (!isDuplicate) {
      const updatedPrograms = [...programs, formData];
      localStorage.setItem('programs', JSON.stringify(updatedPrograms));
    }

    navigate('/');
  };

  const handleChange = (
    e: React.ChangeEvent<HTMLInputElement | HTMLTextAreaElement>
  ) => {
    const {name, value} = e.target;
    setFormData(prev => ({...prev, [name]: value}));
  };

  return (
    <form method="post" id="add-program-form" onSubmit={handleSubmit}>
      <p>
        <span>Name</span>
        <input
          placeholder="Name"
          aria-label="Program Name"
          type="text"
          name="name"
          value={formData.name}
          onChange={handleChange}
          required
        />
        <input
          placeholder="Description"
          aria-label="Description"
          type="text"
          name="description"
          value={formData.description}
          onChange={handleChange}
          required
        />
      </p>
      <p>
        <button type="submit">Save</button>
        <button type="button" onClick={() => navigate('/')}>
          Cancel
        </button>
      </p>
    </form>
  );
};
